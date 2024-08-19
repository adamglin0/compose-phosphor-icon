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

public val LightGroup.House: ImageVector
    get() {
        if (_house != null) {
            return _house!!
        }
        _house = Builder(name = "House", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.9f, 110.1f)
                lineToRelative(-80.0f, -80.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineToRelative(-80.0f, 80.0f)
                arcTo(13.92f, 13.92f, 0.0f, false, false, 34.0f, 120.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineTo(158.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineTo(120.0f)
                arcTo(13.92f, 13.92f, 0.0f, false, false, 217.9f, 110.1f)
                close()
                moveTo(210.0f, 210.0f)
                horizontalLineTo(158.0f)
                verticalLineTo(152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                horizontalLineTo(104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(58.0f)
                horizontalLineTo(46.0f)
                verticalLineTo(120.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.58f, -1.42f)
                lineToRelative(80.0f, -80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.84f, 0.0f)
                lineToRelative(80.0f, 80.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 210.0f, 120.0f)
                close()
            }
        }
        .build()
        return _house!!
    }

private var _house: ImageVector? = null
