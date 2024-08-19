package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Rainbow-cloud-duotone`: ImageVector
    get() {
        if (`_rainbow-cloud-duotone` != null) {
            return `_rainbow-cloud-duotone`!!
        }
        `_rainbow-cloud-duotone` = Builder(name = "Rainbow-cloud-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                horizontalLineTo(152.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, -11.14f, -24.0f, -24.89f)
                reflectiveCurveToRelative(10.75f, -24.89f, 24.0f, -24.89f)
                arcToRelative(23.33f, 23.33f, 0.0f, false, true, 8.81f, 1.73f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 240.0f, 160.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 112.0f)
                arcToRelative(48.18f, 48.18f, 0.0f, false, false, -44.66f, 30.4f)
                arcToRelative(31.0f, 31.0f, 0.0f, false, false, -3.34f, -0.18f)
                curveToRelative(-17.65f, 0.0f, -32.0f, 14.76f, -32.0f, 32.89f)
                reflectiveCurveTo(134.35f, 208.0f, 152.0f, 208.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, -96.0f)
                close()
                moveTo(200.0f, 192.0f)
                lineTo(152.0f, 192.0f)
                curveToRelative(-8.82f, 0.0f, -16.0f, -7.58f, -16.0f, -16.89f)
                reflectiveCurveToRelative(7.18f, -16.89f, 16.0f, -16.89f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, 5.78f, 1.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.87f, -5.81f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 200.0f, 192.0f)
                close()
                moveTo(24.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(8.0f, 160.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 184.5f, 85.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.15f, 11.47f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 24.0f, 160.0f)
                close()
                moveTo(56.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(40.0f, 160.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 114.6f, -58.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -9.47f, 12.89f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 56.0f, 160.0f)
                close()
                moveTo(117.57f, 136.65f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 88.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(72.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 49.27f, -38.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -3.7f, 15.57f)
                close()
            }
        }
        .build()
        return `_rainbow-cloud-duotone`!!
    }

private var `_rainbow-cloud-duotone`: ImageVector? = null
