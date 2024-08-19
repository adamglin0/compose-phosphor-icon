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

public val ThinGroup.Fileimage: ImageVector
    get() {
        if (_fileimage != null) {
            return _fileimage!!
        }
        _fileimage = Builder(name = "Fileimage", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(107.33f, 149.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.66f, 0.0f)
                lineTo(76.42f, 186.15f)
                lineTo(63.36f, 165.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.72f, 0.0f)
                lineToRelative(-36.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 228.0f)
                horizontalLineTo(152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.33f, -6.22f)
                close()
                moveTo(31.33f, 220.0f)
                lineTo(60.0f, 175.4f)
                lineToRelative(13.0f, 20.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.33f, 1.83f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, false, 3.36f, -1.78f)
                lineTo(104.0f, 159.21f)
                lineTo(144.53f, 220.0f)
                close()
                moveTo(210.83f, 85.17f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 152.0f, 28.0f)
                horizontalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(92.0f)
                verticalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(52.0f)
                verticalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 210.83f, 85.17f)
                close()
                moveTo(156.0f, 41.65f)
                lineTo(198.34f, 84.0f)
                horizontalLineTo(156.0f)
                close()
            }
        }
        .build()
        return _fileimage!!
    }

private var _fileimage: ImageVector? = null
