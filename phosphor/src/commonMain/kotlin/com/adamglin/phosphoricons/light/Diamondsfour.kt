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

public val LightGroup.DiamondsFour: ImageVector
    get() {
        if (_diamondsFour != null) {
            return _diamondsFour!!
        }
        _diamondsFour = Builder(name = "DiamondsFour", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(123.76f, 108.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.48f)
                lineToRelative(-40.0f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.48f)
                close()
                moveTo(128.0f, 32.49f)
                lineTo(159.51f, 64.0f)
                lineTo(128.0f, 95.51f)
                lineTo(96.49f, 64.0f)
                close()
                moveTo(132.24f, 147.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.48f)
                lineToRelative(40.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.48f)
                close()
                moveTo(128.0f, 223.51f)
                lineTo(96.49f, 192.0f)
                lineTo(128.0f, 160.49f)
                lineTo(159.51f, 192.0f)
                close()
                moveTo(236.24f, 123.76f)
                lineTo(196.24f, 83.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.48f)
                lineToRelative(40.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 236.24f, 123.76f)
                close()
                moveTo(192.0f, 159.51f)
                lineTo(160.49f, 128.0f)
                lineTo(192.0f, 96.49f)
                lineTo(223.51f, 128.0f)
                close()
                moveTo(108.24f, 123.76f)
                lineTo(68.24f, 83.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.48f)
                lineToRelative(40.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 108.24f, 123.76f)
                close()
                moveTo(64.0f, 159.51f)
                lineTo(32.49f, 128.0f)
                lineTo(64.0f, 96.49f)
                lineTo(95.51f, 128.0f)
                close()
            }
        }
        .build()
        return _diamondsFour!!
    }

private var _diamondsFour: ImageVector? = null
