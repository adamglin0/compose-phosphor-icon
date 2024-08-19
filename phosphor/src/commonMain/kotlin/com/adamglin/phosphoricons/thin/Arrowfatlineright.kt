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

public val ThinGroup.Arrowfatlineright: ImageVector
    get() {
        if (_arrowfatlineright != null) {
            return _arrowfatlineright!!
        }
        _arrowfatlineright = Builder(name = "Arrowfatlineright", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.83f, 125.17f)
                lineToRelative(-96.0f, -96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 132.0f, 32.0f)
                verticalLineTo(76.0f)
                horizontalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(60.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.47f, 3.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.36f, -0.87f)
                lineToRelative(96.0f, -96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 234.83f, 125.17f)
                close()
                moveTo(140.0f, 214.34f)
                verticalLineTo(176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(76.0f)
                verticalLineTo(84.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(41.66f)
                lineTo(226.34f, 128.0f)
                close()
                moveTo(44.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowfatlineright!!
    }

private var _arrowfatlineright: ImageVector? = null
