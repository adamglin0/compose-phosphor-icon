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

public val FillGroup.Houseline: ImageVector
    get() {
        if (_houseline != null) {
            return _houseline!!
        }
        _houseline = Builder(name = "Houseline", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 208.0f)
                lineTo(224.0f, 208.0f)
                lineTo(224.0f, 136.0f)
                lineToRelative(2.34f, 2.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 237.66f, 127.0f)
                lineTo(139.31f, 28.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f)
                lineTo(18.34f, 127.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.31f)
                lineTo(32.0f, 136.0f)
                verticalLineToRelative(72.0f)
                lineTo(16.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(240.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(152.0f, 208.0f)
                lineTo(104.0f, 208.0f)
                lineTo(104.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _houseline!!
    }

private var _houseline: ImageVector? = null
