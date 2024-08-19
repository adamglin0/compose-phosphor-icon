package com.adamglin.phosphoricons.fill

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
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Bookmarkssimple: ImageVector
    get() {
        if (_bookmarkssimple != null) {
            return _bookmarkssimple!!
        }
        _bookmarkssimple = Builder(name = "Bookmarkssimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 56.0f)
                horizontalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 72.0f)
                verticalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.65f, 6.51f)
                lineTo(112.0f, 193.83f)
                lineToRelative(51.36f, 36.68f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 224.0f)
                verticalLineTo(72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 160.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 24.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(192.0f)
                verticalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 24.0f)
                close()
            }
        }
        .build()
        return _bookmarkssimple!!
    }

private var _bookmarkssimple: ImageVector? = null
