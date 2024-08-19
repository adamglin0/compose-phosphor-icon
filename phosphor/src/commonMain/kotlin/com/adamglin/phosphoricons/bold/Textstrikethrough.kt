package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Textstrikethrough: ImageVector
    get() {
        if (_textstrikethrough != null) {
            return _textstrikethrough!!
        }
        _textstrikethrough = Builder(name = "Textstrikethrough", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(185.86f)
                arcTo(41.48f, 41.48f, 0.0f, false, true, 196.0f, 168.0f)
                curveToRelative(0.0f, 14.45f, -7.81f, 28.32f, -21.43f, 38.05f)
                curveTo(162.0f, 215.05f, 145.44f, 220.0f, 128.0f, 220.0f)
                reflectiveCurveToRelative(-34.0f, -4.95f, -46.57f, -13.95f)
                curveTo(67.81f, 196.32f, 60.0f, 182.45f, 60.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                curveToRelative(0.0f, 15.18f, 20.15f, 28.0f, 44.0f, 28.0f)
                reflectiveCurveToRelative(44.0f, -12.82f, 44.0f, -28.0f)
                curveToRelative(0.0f, -12.76f, -9.3f, -20.18f, -35.35f, -28.0f)
                horizontalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(216.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 128.0f)
                close()
                moveTo(75.11f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                curveToRelative(0.0f, -16.0f, 17.58f, -28.0f, 40.89f, -28.0f)
                curveToRelative(17.36f, 0.0f, 31.37f, 6.65f, 37.48f, 17.78f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 21.0f, -11.56f)
                curveTo(176.13f, 47.3f, 154.25f, 36.0f, 128.0f, 36.0f)
                curveTo(91.0f, 36.0f, 63.11f, 58.35f, 63.11f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 75.11f, 100.0f)
                close()
            }
        }
        .build()
        return _textstrikethrough!!
    }

private var _textstrikethrough: ImageVector? = null
