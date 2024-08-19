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

public val LightGroup.Playlist: ImageVector
    get() {
        if (_playlist != null) {
            return _playlist!!
        }
        _playlist = Builder(name = "Playlist", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(216.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(40.0f, 70.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 34.0f, 64.0f)
                close()
                moveTo(40.0f, 134.0f)
                lineTo(160.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(40.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(112.0f, 186.0f)
                lineTo(40.0f, 186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(245.75f, 125.72f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.48f, 4.0f)
                lineTo(206.0f, 120.06f)
                lineTo(206.0f, 192.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, -12.0f, -24.0f)
                lineTo(194.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.72f, -5.75f)
                lineToRelative(40.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 245.75f, 125.72f)
                close()
                moveTo(194.0f, 192.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, false, -18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 194.0f, 192.0f)
                close()
            }
        }
        .build()
        return _playlist!!
    }

private var _playlist: ImageVector? = null
