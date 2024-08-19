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

public val LightGroup.Devicemobilespeaker: ImageVector
    get() {
        if (_devicemobilespeaker != null) {
            return _devicemobilespeaker!!
        }
        _devicemobilespeaker = Builder(name = "Devicemobilespeaker", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 18.0f)
                lineTo(80.0f, 18.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 58.0f, 40.0f)
                lineTo(58.0f, 216.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                lineTo(198.0f, 40.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 176.0f, 18.0f)
                close()
                moveTo(186.0f, 216.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                lineTo(80.0f, 226.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(70.0f, 40.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 80.0f, 30.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                close()
                moveTo(166.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 62.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 56.0f)
                close()
            }
        }
        .build()
        return _devicemobilespeaker!!
    }

private var _devicemobilespeaker: ImageVector? = null
