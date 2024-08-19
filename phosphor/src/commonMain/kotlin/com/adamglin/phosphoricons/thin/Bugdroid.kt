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

public val ThinGroup.Bugdroid: ImageVector
    get() {
        if (_bugdroid != null) {
            return _bugdroid!!
        }
        _bugdroid = Builder(name = "Bugdroid", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.17f, 51.49f)
                lineToRelative(16.66f, -16.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineToRelative(-17.0f, 17.0f)
                arcToRelative(83.72f, 83.72f, 0.0f, false, false, -104.26f, 0.0f)
                lineToRelative(-17.0f, -17.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(69.83f, 51.49f)
                arcTo(83.75f, 83.75f, 0.0f, false, false, 44.0f, 112.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f)
                lineTo(212.0f, 112.0f)
                arcTo(83.75f, 83.75f, 0.0f, false, false, 186.17f, 51.49f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, true, 76.0f, 76.0f)
                verticalLineToRelative(12.0f)
                lineTo(52.0f, 124.0f)
                lineTo(52.0f, 112.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(128.0f, 228.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, -76.0f)
                lineTo(52.0f, 132.0f)
                lineTo(204.0f, 132.0f)
                verticalLineToRelative(20.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 128.0f, 228.0f)
                close()
                moveTo(148.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 148.0f, 92.0f)
                close()
                moveTo(92.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 92.0f)
                close()
            }
        }
        .build()
        return _bugdroid!!
    }

private var _bugdroid: ImageVector? = null
