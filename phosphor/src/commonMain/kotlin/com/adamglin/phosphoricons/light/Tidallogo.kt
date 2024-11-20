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

public val LightGroup.TidalLogo: ImageVector
    get() {
        if (_tidalLogo != null) {
            return _tidalLogo!!
        }
        _tidalLogo = Builder(name = "TidalLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.24f, 91.76f)
                lineToRelative(-40.0f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineTo(168.0f, 87.52f)
                lineTo(132.24f, 51.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineTo(88.0f, 87.52f)
                lineTo(52.24f, 51.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.48f)
                lineToRelative(40.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 0.0f)
                lineTo(88.0f, 104.48f)
                lineTo(119.52f, 136.0f)
                lineTo(83.76f, 171.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.48f)
                lineToRelative(40.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.48f)
                lineTo(136.48f, 136.0f)
                lineTo(168.0f, 104.48f)
                lineToRelative(35.76f, 35.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 252.24f, 91.76f)
                close()
                moveTo(48.0f, 127.51f)
                lineTo(16.49f, 96.0f)
                lineTo(48.0f, 64.49f)
                lineTo(79.51f, 96.0f)
                close()
                moveTo(128.0f, 207.51f)
                lineTo(96.49f, 176.0f)
                lineTo(128.0f, 144.49f)
                lineTo(159.51f, 176.0f)
                close()
                moveTo(128.0f, 127.51f)
                lineTo(96.49f, 96.0f)
                lineTo(128.0f, 64.49f)
                lineTo(159.51f, 96.0f)
                close()
                moveTo(208.0f, 127.51f)
                lineTo(176.49f, 96.0f)
                lineTo(208.0f, 64.49f)
                lineTo(239.51f, 96.0f)
                close()
            }
        }
        .build()
        return _tidalLogo!!
    }

private var _tidalLogo: ImageVector? = null
