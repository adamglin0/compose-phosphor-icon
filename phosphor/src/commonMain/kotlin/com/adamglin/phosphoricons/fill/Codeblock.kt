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

public val FillGroup.CodeBlock: ImageVector
    get() {
        if (_codeBlock != null) {
            return _codeBlock!!
        }
        _codeBlock = Builder(name = "CodeBlock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 40.0f)
                lineTo(168.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(32.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 40.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 40.0f)
                close()
                moveTo(106.34f, 61.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(124.69f, 80.0f)
                close()
                moveTo(42.34f, 85.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f)
                lineToRelative(24.0f, -24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 77.66f, 61.66f)
                lineTo(59.31f, 80.0f)
                lineTo(77.66f, 98.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                close()
                moveTo(200.0f, 200.0f)
                lineTo(56.0f, 200.0f)
                lineTo(56.0f, 136.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(168.0f, 56.0f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _codeBlock!!
    }

private var _codeBlock: ImageVector? = null
