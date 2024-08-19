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

public val ThinGroup.Texttslash: ImageVector
    get() {
        if (_texttslash != null) {
            return _texttslash!!
        }
        _texttslash = Builder(name = "Texttslash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.69f, 219.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.65f, -0.27f)
                lineToRelative(-73.0f, -80.34f)
                verticalLineTo(196.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(28.0f)
                verticalLineTo(129.55f)
                lineTo(60.78f, 60.0f)
                horizontalLineTo(60.0f)
                verticalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.0f, -3.45f)
                lineToRelative(-9.0f, -9.86f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 51.0f, 37.31f)
                lineToRelative(160.0f, 176.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 210.69f, 219.0f)
                close()
                moveTo(105.79f, 60.0f)
                horizontalLineTo(124.0f)
                verticalLineTo(80.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(60.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(105.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
            }
        }
        .build()
        return _texttslash!!
    }

private var _texttslash: ImageVector? = null
