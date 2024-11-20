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

public val FillGroup.Scribble: ImageVector
    get() {
        if (_scribble != null) {
            return _scribble!!
        }
        _scribble = Builder(name = "Scribble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                horizontalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(193.66f, 169.66f)
                lineToRelative(-8.0f, 8.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, 12.68f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, true, 0.0f, -35.32f)
                lineToRelative(8.0f, -8.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, -12.68f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -12.68f, 0.0f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, true, -35.32f, -35.32f)
                lineToRelative(72.0f, -72.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, -12.68f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -12.68f, 0.0f)
                lineToRelative(-48.0f, 48.0f)
                arcTo(25.0f, 25.0f, 0.0f, false, true, 62.34f, 86.34f)
                lineToRelative(28.0f, -28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineToRelative(-28.0f, 28.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, 12.68f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 12.68f, 0.0f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, true, 35.32f, 35.32f)
                lineToRelative(-72.0f, 72.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, 12.68f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 12.68f, 0.0f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, true, 35.32f, 35.32f)
                close()
            }
        }
        .build()
        return _scribble!!
    }

private var _scribble: ImageVector? = null
