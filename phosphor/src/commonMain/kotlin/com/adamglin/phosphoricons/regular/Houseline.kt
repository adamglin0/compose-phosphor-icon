package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.HouseLine: ImageVector
    get() {
        if (_houseLine != null) {
            return _houseLine!!
        }
        _houseLine = Builder(name = "HouseLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(48.0f, 120.0f)
                lineToRelative(80.0f, -80.0f)
                lineToRelative(80.0f, 80.0f)
                verticalLineToRelative(88.0f)
                lineTo(160.0f, 208.0f)
                lineTo(160.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(104.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                lineTo(48.0f, 208.0f)
                close()
                moveTo(144.0f, 208.0f)
                lineTo(112.0f, 208.0f)
                lineTo(112.0f, 160.0f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null
