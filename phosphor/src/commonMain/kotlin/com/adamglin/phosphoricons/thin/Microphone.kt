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

public val ThinGroup.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = Builder(name = "Microphone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 172.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, -44.0f)
                lineTo(172.0f, 64.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -88.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 128.0f, 172.0f)
                close()
                moveTo(92.0f, 64.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -72.0f, 0.0f)
                close()
                moveTo(132.0f, 203.89f)
                lineTo(132.0f, 240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 203.89f)
                arcTo(76.09f, 76.09f, 0.0f, false, true, 52.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 136.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcTo(76.09f, 76.09f, 0.0f, false, true, 132.0f, 203.89f)
                close()
            }
        }
        .build()
        return _microphone!!
    }

private var _microphone: ImageVector? = null
