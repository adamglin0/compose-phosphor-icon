package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Disc: ImageVector
    get() {
        if (_disc != null) {
            return _disc!!
        }
        _disc = Builder(name = "Disc", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(167.2f, 120.0f)
                arcToRelative(39.77f, 39.77f, 0.0f, false, false, -5.84f, -14.0f)
                lineToRelative(34.23f, -34.24f)
                arcToRelative(87.54f, 87.54f, 0.0f, false, true, 20.0f, 48.28f)
                close()
                moveTo(152.0f, 128.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 128.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcTo(88.0f, 88.0f, 0.0f, true, true, 184.28f, 60.4f)
                lineTo(150.0f, 94.64f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 167.2f, 136.0f)
                horizontalLineToRelative(48.43f)
                arcTo(88.11f, 88.11f, 0.0f, false, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _disc!!
    }

private var _disc: ImageVector? = null
