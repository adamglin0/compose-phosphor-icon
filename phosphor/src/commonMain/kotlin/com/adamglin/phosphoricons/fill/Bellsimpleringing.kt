package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Bellsimpleringing: ImageVector
    get() {
        if (_bellsimpleringing != null) {
            return _bellsimpleringing!!
        }
        _bellsimpleringing = Builder(name = "Bellsimpleringing", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 224.0f)
                close()
                moveTo(227.39f, 60.32f)
                arcToRelative(111.36f, 111.36f, 0.0f, false, false, -39.12f, -43.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.54f, 13.53f)
                arcToRelative(94.13f, 94.13f, 0.0f, false, true, 33.46f, 36.91f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.2f, -7.36f)
                close()
                moveTo(35.71f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.1f, -4.32f)
                arcTo(94.13f, 94.13f, 0.0f, false, true, 76.27f, 30.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.54f, -13.53f)
                arcTo(111.36f, 111.36f, 0.0f, false, false, 28.61f, 60.32f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 35.71f, 72.0f)
                close()
                moveTo(208.0f, 112.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -160.0f, 0.0f)
                curveToRelative(0.0f, 26.28f, -4.78f, 48.39f, -13.81f, 63.94f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 200.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.79f, -24.06f)
                curveTo(212.78f, 160.38f, 208.0f, 138.27f, 208.0f, 112.0f)
                close()
            }
        }
        .build()
        return _bellsimpleringing!!
    }

private var _bellsimpleringing: ImageVector? = null
