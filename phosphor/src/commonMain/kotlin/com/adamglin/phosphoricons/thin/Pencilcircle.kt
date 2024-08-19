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

public val ThinGroup.Pencilcircle: ImageVector
    get() {
        if (_pencilcircle != null) {
            return _pencilcircle!!
        }
        _pencilcircle = Builder(name = "Pencilcircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.71f, 57.29f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 57.29f, 198.71f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 198.71f, 57.29f)
                close()
                moveTo(104.71f, 132.0f)
                horizontalLineToRelative(46.58f)
                lineToRelative(17.28f, 37.45f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 177.6f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -40.57f, -8.15f)
                close()
                moveTo(108.41f, 124.0f)
                lineTo(128.0f, 81.55f)
                lineTo(147.59f, 124.0f)
                close()
                moveTo(132.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineToRelative(16.83f)
                arcToRelative(91.31f, 91.31f, 0.0f, false, true, -40.0f, 11.07f)
                close()
                moveTo(84.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineToRelative(27.9f)
                arcToRelative(91.31f, 91.31f, 0.0f, false, true, -40.0f, -11.07f)
                close()
                moveTo(193.05f, 193.05f)
                arcTo(92.41f, 92.41f, 0.0f, false, true, 180.0f, 203.9f)
                lineTo(180.0f, 176.0f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, false, -0.37f, -1.68f)
                lineToRelative(-48.0f, -104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.26f, 0.0f)
                lineToRelative(-48.0f, 104.0f)
                arcTo(4.07f, 4.07f, 0.0f, false, false, 76.0f, 176.0f)
                verticalLineToRelative(27.9f)
                arcToRelative(92.41f, 92.41f, 0.0f, false, true, -13.0f, -10.85f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 130.1f, 0.0f)
                close()
            }
        }
        .build()
        return _pencilcircle!!
    }

private var _pencilcircle: ImageVector? = null
