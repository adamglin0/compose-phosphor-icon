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

public val ThinGroup.Teabag: ImageVector
    get() {
        if (_teabag != null) {
            return _teabag!!
        }
        _teabag = Builder(name = "Teabag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 164.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineTo(64.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -104.0f, 0.0f)
                verticalLineTo(76.0f)
                horizontalLineTo(76.53f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, false, -10.29f, 5.83f)
                lineTo(45.71f, 116.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 122.22f)
                verticalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(122.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.71f, -6.18f)
                lineTo(141.76f, 81.83f)
                arcTo(12.06f, 12.06f, 0.0f, false, false, 131.47f, 76.0f)
                horizontalLineTo(108.0f)
                verticalLineTo(64.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 88.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(131.47f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.43f, 1.94f)
                lineToRelative(20.53f, 34.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.57f, 2.06f)
                verticalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(122.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.57f, -2.06f)
                lineTo(73.1f, 85.94f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 76.53f, 84.0f)
                horizontalLineTo(100.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(84.0f)
                close()
            }
        }
        .build()
        return _teabag!!
    }

private var _teabag: ImageVector? = null
