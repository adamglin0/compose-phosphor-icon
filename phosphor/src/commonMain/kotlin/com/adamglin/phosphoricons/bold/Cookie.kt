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

public val BoldGroup.Cookie: ImageVector
    get() {
        if (_cookie != null) {
            return _cookie!!
        }
        _cookie = Builder(name = "Cookie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(167.31f, 160.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -22.62f, 0.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 167.31f, 160.69f)
                close()
                moveTo(80.69f, 152.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 22.62f, 0.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 80.69f, 152.69f)
                close()
                moveTo(95.31f, 119.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -22.62f, 0.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 95.31f, 119.31f)
                close()
                moveTo(143.31f, 112.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, 22.62f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 143.31f, 112.69f)
                close()
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 128.0f)
                close()
                moveTo(211.33f, 138.65f)
                arcTo(60.17f, 60.17f, 0.0f, false, true, 165.0f, 91.0f)
                arcToRelative(60.17f, 60.17f, 0.0f, false, true, -47.66f, -46.32f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, 94.0f, 94.0f)
                close()
            }
        }
        .build()
        return _cookie!!
    }

private var _cookie: ImageVector? = null
