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

public val ThinGroup.Repeatonce: ImageVector
    get() {
        if (_repeatonce != null) {
            return _repeatonce!!
        }
        _repeatonce = Builder(name = "Repeatonce", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 128.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 96.0f, 60.0f)
                lineTo(214.34f, 60.0f)
                lineTo(197.17f, 42.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineTo(214.34f, 68.0f)
                lineTo(96.0f, 68.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(224.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, true, -60.0f, 60.0f)
                lineTo(41.66f, 188.0f)
                lineToRelative(17.17f, -17.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f)
                lineTo(41.66f, 196.0f)
                lineTo(160.0f, 196.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, false, 68.0f, -68.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 124.0f)
                close()
                moveTo(136.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(140.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.79f, -3.58f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 7.16f)
                lineToRelative(10.21f, -5.1f)
                lineTo(132.0f, 152.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 136.0f, 156.0f)
                close()
            }
        }
        .build()
        return _repeatonce!!
    }

private var _repeatonce: ImageVector? = null
