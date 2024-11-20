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

public val ThinGroup.ShuffleSimple: ImageVector
    get() {
        if (_shuffleSimple != null) {
            return _shuffleSimple!!
        }
        _shuffleSimple = Builder(name = "ShuffleSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 48.0f)
                lineTo(212.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(204.0f, 57.66f)
                lineTo(153.46f, 108.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.66f, -5.66f)
                lineTo(198.34f, 52.0f)
                lineTo(168.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 48.0f)
                close()
                moveTo(208.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(30.34f)
                lineTo(50.83f, 45.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(198.34f, 204.0f)
                lineTo(168.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(212.0f, 168.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 164.0f)
                close()
                moveTo(102.54f, 147.8f)
                lineTo(45.17f, 205.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineToRelative(57.37f, -57.37f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                close()
            }
        }
        .build()
        return _shuffleSimple!!
    }

private var _shuffleSimple: ImageVector? = null
