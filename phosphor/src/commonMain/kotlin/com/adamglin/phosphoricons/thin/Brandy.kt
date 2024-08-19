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

public val ThinGroup.Brandy: ImageVector
    get() {
        if (_brandy != null) {
            return _brandy!!
        }
        _brandy = Builder(name = "Brandy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 88.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(91.67f, 91.67f, 0.0f, false, false, -14.88f, -50.18f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 201.77f, 36.0f)
                horizontalLineTo(54.23f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.35f, 1.82f)
                arcTo(91.67f, 91.67f, 0.0f, false, false, 36.0f, 88.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(92.11f, 92.11f, 0.0f, false, false, 88.0f, 91.91f)
                verticalLineTo(220.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(132.0f)
                verticalLineTo(179.91f)
                arcTo(92.11f, 92.11f, 0.0f, false, false, 220.0f, 88.0f)
                close()
                moveTo(56.43f, 44.0f)
                horizontalLineTo(199.57f)
                arcToRelative(83.5f, 83.5f, 0.0f, false, true, 12.32f, 40.0f)
                horizontalLineTo(44.11f)
                arcTo(83.5f, 83.5f, 0.0f, false, true, 56.43f, 44.0f)
                close()
                moveTo(128.0f, 172.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 44.1f, 92.0f)
                horizontalLineTo(211.9f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 128.0f, 172.0f)
                close()
            }
        }
        .build()
        return _brandy!!
    }

private var _brandy: ImageVector? = null
