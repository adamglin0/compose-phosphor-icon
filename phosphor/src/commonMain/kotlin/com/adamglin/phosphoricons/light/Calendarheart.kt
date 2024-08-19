package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Calendarheart: ImageVector
    get() {
        if (_calendarheart != null) {
            return _calendarheart!!
        }
        _calendarheart = Builder(name = "Calendarheart", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 34.0f)
                lineTo(182.0f, 34.0f)
                lineTo(182.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(170.0f, 34.0f)
                lineTo(86.0f, 34.0f)
                lineTo(86.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(74.0f, 34.0f)
                lineTo(48.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f)
                close()
                moveTo(210.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(74.0f, 46.0f)
                lineTo(74.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(86.0f, 46.0f)
                horizontalLineToRelative(84.0f)
                lineTo(170.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(182.0f, 46.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(152.0f, 90.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -24.0f, 12.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -54.0f, 18.0f)
                curveToRelative(0.0f, 35.3f, 49.22f, 60.32f, 51.32f, 61.37f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f)
                curveTo(132.78f, 180.32f, 182.0f, 155.3f, 182.0f, 120.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 152.0f, 90.0f)
                close()
                moveTo(148.33f, 155.25f)
                arcTo(138.0f, 138.0f, 0.0f, false, true, 128.0f, 169.19f)
                arcToRelative(138.82f, 138.82f, 0.0f, false, true, -20.33f, -13.94f)
                curveTo(97.78f, 147.0f, 86.0f, 134.15f, 86.0f, 120.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f)
                curveTo(170.0f, 134.15f, 158.22f, 147.0f, 148.33f, 155.25f)
                close()
            }
        }
        .build()
        return _calendarheart!!
    }

private var _calendarheart: ImageVector? = null
