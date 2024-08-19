package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Textstrikethrough: ImageVector
    get() {
        if (_textstrikethrough != null) {
            return _textstrikethrough!!
        }
        _textstrikethrough = Builder(name = "Textstrikethrough", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(161.16f)
                curveToRelative(15.45f, 7.24f, 26.84f, 17.8f, 26.84f, 36.0f)
                curveToRelative(0.0f, 24.26f, -26.92f, 44.0f, -60.0f, 44.0f)
                reflectiveCurveToRelative(-60.0f, -19.74f, -60.0f, -44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                curveToRelative(0.0f, 19.85f, 23.33f, 36.0f, 52.0f, 36.0f)
                reflectiveCurveToRelative(52.0f, -16.15f, 52.0f, -36.0f)
                curveToRelative(0.0f, -19.54f, -16.13f, -28.3f, -42.18f, -36.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 128.0f)
                close()
                moveTo(76.33f, 100.0f)
                arcToRelative(3.85f, 3.85f, 0.0f, false, false, 1.25f, -0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.55f, -5.0f)
                arcToRelative(21.9f, 21.9f, 0.0f, false, true, -1.0f, -6.75f)
                curveToRelative(0.0f, -20.52f, 21.0f, -36.0f, 48.89f, -36.0f)
                curveToRelative(20.32f, 0.0f, 37.0f, 8.2f, 44.49f, 21.92f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.0f, -3.85f)
                curveTo(170.54f, 53.75f, 151.29f, 44.0f, 128.0f, 44.0f)
                curveTo(95.57f, 44.0f, 71.11f, 62.92f, 71.11f, 88.0f)
                arcToRelative(29.76f, 29.76f, 0.0f, false, false, 1.42f, 9.25f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 76.33f, 100.0f)
                close()
            }
        }
        .build()
        return _textstrikethrough!!
    }

private var _textstrikethrough: ImageVector? = null
