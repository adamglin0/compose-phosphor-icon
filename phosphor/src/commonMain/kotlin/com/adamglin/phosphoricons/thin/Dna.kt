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

public val ThinGroup.Dna: ImageVector
    get() {
        if (_dna != null) {
            return _dna!!
        }
        _dna = Builder(name = "Dna", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 204.5f)
                lineTo(196.0f, 232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(188.0f, 204.5f)
                arcToRelative(67.62f, 67.62f, 0.0f, false, false, -37.59f, -60.82f)
                lineTo(102.0f, 119.48f)
                arcToRelative(75.6f, 75.6f, 0.0f, false, true, -42.0f, -68.0f)
                lineTo(60.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(68.0f, 51.5f)
                arcToRelative(67.62f, 67.62f, 0.0f, false, false, 37.59f, 60.82f)
                lineToRelative(48.4f, 24.2f)
                arcTo(75.6f, 75.6f, 0.0f, false, true, 196.0f, 204.5f)
                close()
                moveTo(160.0f, 204.0f)
                lineTo(68.0f, 204.0f)
                arcToRelative(67.74f, 67.74f, 0.0f, false, true, 4.59f, -24.0f)
                horizontalLineToRelative(75.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(76.3f, 172.0f)
                arcToRelative(67.91f, 67.91f, 0.0f, false, true, 19.45f, -22.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 91.0f, 143.24f)
                arcTo(76.26f, 76.26f, 0.0f, false, false, 60.0f, 204.5f)
                lineTo(60.0f, 232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(68.0f, 212.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(192.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(188.0f, 44.0f)
                lineTo(96.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(67.74f, 67.74f, 0.0f, false, true, -4.59f, 24.0f)
                lineTo(107.89f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                lineTo(179.7f, 84.0f)
                arcToRelative(67.91f, 67.91f, 0.0f, false, true, -19.45f, 22.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.74f, 6.45f)
                arcTo(76.26f, 76.26f, 0.0f, false, false, 196.0f, 51.5f)
                lineTo(196.0f, 24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 192.0f, 20.0f)
                close()
            }
        }
        .build()
        return _dna!!
    }

private var _dna: ImageVector? = null
