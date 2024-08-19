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

public val ThinGroup.Arrowuupright: ImageVector
    get() {
        if (_arrowuupright != null) {
            return _arrowuupright!!
        }
        _arrowuupright = Builder(name = "Arrowuupright", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(173.17f, 133.17f)
                lineTo(214.34f, 92.0f)
                horizontalLineTo(88.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, 104.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(88.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 88.0f, 84.0f)
                horizontalLineTo(214.34f)
                lineTo(173.17f, 42.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineToRelative(48.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                close()
            }
        }
        .build()
        return _arrowuupright!!
    }

private var _arrowuupright: ImageVector? = null
