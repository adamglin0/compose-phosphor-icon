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

public val DuotoneGroup.`Stethoscope-duotone`: ImageVector
    get() {
        if (`_stethoscope-duotone` != null) {
            return `_stethoscope-duotone`!!
        }
        `_stethoscope-duotone` = Builder(name = "Stethoscope-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 240.0f, 160.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 160.0f)
                close()
                moveTo(215.45f, 199.29f)
                arcTo(48.08f, 48.08f, 0.0f, false, true, 168.0f, 240.0f)
                lineTo(144.0f, 240.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, -48.0f)
                lineTo(96.0f, 151.49f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 40.0f, 88.0f)
                lineTo(40.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(72.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(56.0f, 48.0f)
                lineTo(56.0f, 88.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.64f, 48.0f)
                curveToRelative(26.11f, -0.34f, 47.36f, -22.25f, 47.36f, -48.83f)
                lineTo(152.0f, 48.0f)
                lineTo(136.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                lineTo(168.0f, 87.17f)
                curveToRelative(0.0f, 32.84f, -24.53f, 60.29f, -56.0f, 64.31f)
                lineTo(112.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, false, 31.22f, -25.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 16.23f, 0.27f)
                close()
                moveTo(232.0f, 160.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 232.0f, 160.0f)
                close()
            }
        }
        .build()
        return `_stethoscope-duotone`!!
    }

private var `_stethoscope-duotone`: ImageVector? = null
