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

public val ThinGroup.Arrowelbowrightdown: ImageVector
    get() {
        if (_arrowelbowrightdown != null) {
            return _arrowelbowrightdown!!
        }
        _arrowelbowrightdown = Builder(name = "Arrowelbowrightdown", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.83f, 162.83f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, -5.66f)
                lineTo(172.0f, 198.34f)
                verticalLineTo(68.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineTo(198.34f)
                lineToRelative(41.17f, -41.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f)
                close()
            }
        }
        .build()
        return _arrowelbowrightdown!!
    }

private var _arrowelbowrightdown: ImageVector? = null
