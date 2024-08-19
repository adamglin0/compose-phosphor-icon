package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Usercircle: ImageVector
    get() {
        if (_usercircle != null) {
            return _usercircle!!
        }
        _usercircle = Builder(name = "Usercircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(79.57f, 196.57f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 96.86f, 0.0f)
                arcToRelative(83.72f, 83.72f, 0.0f, false, true, -96.86f, 0.0f)
                close()
                moveTo(100.0f, 120.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 100.0f, 120.0f)
                close()
                moveTo(194.0f, 179.94f)
                arcToRelative(83.48f, 83.48f, 0.0f, false, false, -29.0f, -23.42f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, -74.0f, 0.0f)
                arcToRelative(83.48f, 83.48f, 0.0f, false, false, -29.0f, 23.42f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 131.9f, 0.0f)
                close()
            }
        }
        .build()
        return _usercircle!!
    }

private var _usercircle: ImageVector? = null
