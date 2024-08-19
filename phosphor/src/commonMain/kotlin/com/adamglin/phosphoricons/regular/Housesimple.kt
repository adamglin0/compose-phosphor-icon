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

public val RegularGroup.Housesimple: ImageVector
    get() {
        if (_housesimple != null) {
            return _housesimple!!
        }
        _housesimple = Builder(name = "Housesimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.31f, 108.68f)
                lineToRelative(-80.0f, -80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f)
                lineToRelative(-80.0f, 80.0f)
                arcTo(15.87f, 15.87f, 0.0f, false, false, 32.0f, 120.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(120.0f)
                arcTo(15.87f, 15.87f, 0.0f, false, false, 219.31f, 108.68f)
                close()
                moveTo(208.0f, 208.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(120.0f)
                lineToRelative(80.0f, -80.0f)
                lineToRelative(80.0f, 80.0f)
                close()
            }
        }
        .build()
        return _housesimple!!
    }

private var _housesimple: ImageVector? = null
