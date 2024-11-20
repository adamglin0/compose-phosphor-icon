package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.HouseLine: ImageVector
    get() {
        if (_houseLine != null) {
            return _houseLine!!
        }
        _houseLine = Builder(name = "HouseLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 210.0f)
                horizontalLineTo(222.0f)
                verticalLineTo(131.17f)
                lineToRelative(5.76f, 5.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.49f)
                lineTo(137.9f, 30.09f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(19.76f, 128.44f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 8.49f)
                lineTo(34.0f, 131.17f)
                verticalLineTo(210.0f)
                horizontalLineTo(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(240.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(46.0f, 119.17f)
                lineToRelative(80.58f, -80.59f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.84f, 0.0f)
                lineTo(210.0f, 119.17f)
                verticalLineTo(210.0f)
                horizontalLineTo(158.0f)
                verticalLineTo(152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                horizontalLineTo(104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(58.0f)
                horizontalLineTo(46.0f)
                close()
                moveTo(146.0f, 210.0f)
                horizontalLineTo(110.0f)
                verticalLineTo(158.0f)
                horizontalLineToRelative(36.0f)
                close()
            }
        }
        .build()
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null
