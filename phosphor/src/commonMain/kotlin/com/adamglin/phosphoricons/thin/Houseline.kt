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

public val ThinGroup.Houseline: ImageVector
    get() {
        if (_houseline != null) {
            return _houseline!!
        }
        _houseline = Builder(name = "Houseline", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 212.0f)
                horizontalLineTo(220.0f)
                verticalLineTo(126.34f)
                lineToRelative(9.17f, 9.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f)
                lineTo(136.49f, 31.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(21.17f, 129.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, 5.66f)
                lineTo(36.0f, 126.34f)
                verticalLineTo(212.0f)
                horizontalLineTo(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(44.0f, 118.34f)
                lineToRelative(81.17f, -81.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineTo(212.0f, 118.34f)
                verticalLineTo(212.0f)
                horizontalLineTo(156.0f)
                verticalLineTo(152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(60.0f)
                horizontalLineTo(44.0f)
                close()
                moveTo(148.0f, 212.0f)
                horizontalLineTo(108.0f)
                verticalLineTo(156.0f)
                horizontalLineToRelative(40.0f)
                close()
            }
        }
        .build()
        return _houseline!!
    }

private var _houseline: ImageVector? = null
