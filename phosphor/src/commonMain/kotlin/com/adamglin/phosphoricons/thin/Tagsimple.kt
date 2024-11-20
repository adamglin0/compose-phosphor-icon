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

public val ThinGroup.TagSimple: ImageVector
    get() {
        if (_tagSimple != null) {
            return _tagSimple!!
        }
        _tagSimple = Builder(name = "TagSimple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.33f, 125.78f)
                lineTo(197.7f, 57.34f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.0f, -5.34f)
                lineTo(40.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 64.0f)
                lineTo(28.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(187.72f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.0f, -5.34f)
                lineToRelative(45.63f, -68.44f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 243.33f, 125.78f)
                close()
                moveTo(191.05f, 194.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.33f, 1.78f)
                lineTo(40.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(187.72f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.33f, 1.78f)
                lineTo(235.19f, 128.0f)
                close()
            }
        }
        .build()
        return _tagSimple!!
    }

private var _tagSimple: ImageVector? = null
