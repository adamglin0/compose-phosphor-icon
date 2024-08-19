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

public val DuotoneGroup.`Warning-duotone`: ImageVector
    get() {
        if (`_warning-duotone` != null) {
            return `_warning-duotone`!!
        }
        `_warning-duotone` = Builder(name = "Warning-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(215.46f, 216.0f)
                horizontalLineTo(40.54f)
                curveTo(27.92f, 216.0f, 20.0f, 202.79f, 26.13f, 192.09f)
                lineTo(113.59f, 40.22f)
                curveToRelative(6.3f, -11.0f, 22.52f, -11.0f, 28.82f, 0.0f)
                lineToRelative(87.46f, 151.87f)
                curveTo(236.0f, 202.79f, 228.08f, 216.0f, 215.46f, 216.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.8f, 188.09f)
                lineTo(149.35f, 36.22f)
                horizontalLineToRelative(0.0f)
                arcToRelative(24.76f, 24.76f, 0.0f, false, false, -42.7f, 0.0f)
                lineTo(19.2f, 188.09f)
                arcToRelative(23.51f, 23.51f, 0.0f, false, false, 0.0f, 23.72f)
                arcTo(24.35f, 24.35f, 0.0f, false, false, 40.55f, 224.0f)
                horizontalLineToRelative(174.9f)
                arcToRelative(24.35f, 24.35f, 0.0f, false, false, 21.33f, -12.19f)
                arcTo(23.51f, 23.51f, 0.0f, false, false, 236.8f, 188.09f)
                close()
                moveTo(222.93f, 203.8f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -7.48f, 4.2f)
                lineTo(40.55f, 208.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -7.48f, -4.2f)
                arcToRelative(7.59f, 7.59f, 0.0f, false, true, 0.0f, -7.72f)
                lineTo(120.52f, 44.21f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, true, 15.0f, 0.0f)
                lineToRelative(87.45f, 151.87f)
                arcTo(7.59f, 7.59f, 0.0f, false, true, 222.93f, 203.8f)
                close()
                moveTo(120.0f, 144.0f)
                lineTo(120.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(140.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 180.0f)
                close()
            }
        }
        .build()
        return `_warning-duotone`!!
    }

private var `_warning-duotone`: ImageVector? = null
