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

public val ThinGroup.Meteor: ImageVector
    get() {
        if (_meteor != null) {
            return _meteor!!
        }
        _meteor = Builder(name = "Meteor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 124.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 96.0f, 124.0f)
                close()
                moveTo(96.0f, 188.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 96.0f, 188.0f)
                close()
                moveTo(218.83f, 125.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(48.0f, -48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 218.83f, 125.17f)
                close()
                moveTo(186.83f, 106.83f)
                lineTo(162.83f, 130.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                close()
                moveTo(226.83f, 66.83f)
                lineTo(210.83f, 82.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                close()
                moveTo(125.17f, 93.17f)
                lineToRelative(72.0f, -72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                lineToRelative(-72.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.66f, -5.66f)
                close()
                moveTo(144.08f, 202.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.65f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, -96.16f, -96.16f)
                lineToRelative(82.74f, -82.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                lineTo(53.57f, 117.57f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 84.86f, 84.86f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 144.08f, 202.43f)
                close()
            }
        }
        .build()
        return _meteor!!
    }

private var _meteor: ImageVector? = null
