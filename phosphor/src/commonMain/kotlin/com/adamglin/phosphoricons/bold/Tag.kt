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

public val BoldGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.15f, 133.18f)
                lineTo(146.83f, 33.86f)
                arcTo(19.85f, 19.85f, 0.0f, false, false, 132.69f, 28.0f)
                lineTo(40.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 40.0f)
                verticalLineToRelative(92.69f)
                arcToRelative(19.85f, 19.85f, 0.0f, false, false, 5.86f, 14.14f)
                lineToRelative(99.32f, 99.32f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.28f, 0.0f)
                lineToRelative(84.69f, -84.69f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 246.15f, 133.18f)
                close()
                moveTo(147.32f, 226.35f)
                lineTo(52.0f, 131.0f)
                lineTo(52.0f, 52.0f)
                horizontalLineToRelative(79.0f)
                lineToRelative(95.32f, 95.32f)
                close()
                moveTo(104.0f, 88.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 88.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 104.0f, 88.0f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
