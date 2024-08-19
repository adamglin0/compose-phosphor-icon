package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Rainbow-cloud-thin`: ImageVector
    get() {
        if (`_rainbow-cloud-thin` != null) {
            return `_rainbow-cloud-thin`!!
        }
        `_rainbow-cloud-thin` = Builder(name = "Rainbow-cloud-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 116.0f)
                arcToRelative(44.16f, 44.16f, 0.0f, false, false, -42.0f, 30.88f)
                arcToRelative(27.22f, 27.22f, 0.0f, false, false, -6.0f, -0.66f)
                curveToRelative(-15.44f, 0.0f, -28.0f, 13.0f, -28.0f, 28.89f)
                reflectiveCurveTo(136.56f, 204.0f, 152.0f, 204.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, -88.0f)
                close()
                moveTo(200.0f, 196.0f)
                lineTo(152.0f, 196.0f)
                curveToRelative(-11.0f, 0.0f, -20.0f, -9.37f, -20.0f, -20.89f)
                reflectiveCurveToRelative(9.0f, -20.89f, 20.0f, -20.89f)
                arcToRelative(19.13f, 19.13f, 0.0f, false, true, 7.29f, 1.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.44f, -2.9f)
                arcTo(36.0f, 36.0f, 0.0f, true, true, 200.0f, 196.0f)
                close()
                moveTo(20.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(12.0f, 160.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, true, 181.71f, 88.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 176.14f, 94.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 20.0f, 160.0f)
                close()
                moveTo(112.0f, 100.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, 60.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(44.0f, 160.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 108.24f, -54.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.74f, 6.44f)
                arcTo(59.57f, 59.57f, 0.0f, false, false, 112.0f, 100.0f)
                close()
                moveTo(123.31f, 129.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.81f, 3.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 84.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(76.0f, 160.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f)
                arcToRelative(36.58f, 36.58f, 0.0f, false, true, 8.35f, 1.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 123.31f, 129.79f)
                close()
            }
        }
        .build()
        return `_rainbow-cloud-thin`!!
    }

private var `_rainbow-cloud-thin`: ImageVector? = null
