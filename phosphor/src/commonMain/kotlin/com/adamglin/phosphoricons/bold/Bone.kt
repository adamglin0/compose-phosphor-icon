package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Bone: ImageVector
    get() {
        if (_bone != null) {
            return _bone!!
        }
        _bone = Builder(name = "Bone", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.74f, 58.31f)
                arcToRelative(39.89f, 39.89f, 0.0f, false, false, -23.35f, -13.7f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -74.86f, 25.87f)
                lineToRelative(-66.0f, 66.05f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -25.87f, 74.86f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 74.86f, -25.86f)
                lineToRelative(66.05f, -66.06f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 49.22f, -61.16f)
                close()
                moveTo(216.1f, 94.51f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -20.54f, 3.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -24.84f, 2.76f)
                lineToRelative(-70.4f, 70.4f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -2.75f, 24.84f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -29.41f, 6.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 56.3f, 187.7f)
                arcToRelative(11.61f, 11.61f, 0.0f, false, false, -1.85f, 0.14f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 6.0f, -29.4f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 24.83f, -2.76f)
                lineToRelative(70.4f, -70.4f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 2.76f, -24.84f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 29.4f, -6.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.71f, 13.71f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.1f, 94.51f)
                close()
            }
        }
        .build()
        return _bone!!
    }

private var _bone: ImageVector? = null
