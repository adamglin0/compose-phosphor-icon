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

public val ThinGroup.Peace: ImageVector
    get() {
        if (_peace != null) {
            return _peace!!
        }
        _peace = Builder(name = "Peace", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(220.0f, 128.0f)
                arcToRelative(91.44f, 91.44f, 0.0f, false, true, -14.44f, 49.43f)
                lineTo(132.0f, 125.92f)
                lineTo(132.0f, 36.09f)
                arcTo(92.11f, 92.11f, 0.0f, false, true, 220.0f, 128.0f)
                close()
                moveTo(124.0f, 36.09f)
                verticalLineToRelative(89.83f)
                lineTo(50.44f, 177.43f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 124.0f, 36.09f)
                close()
                moveTo(55.0f, 184.0f)
                lineToRelative(69.0f, -48.29f)
                verticalLineToRelative(84.23f)
                arcTo(91.94f, 91.94f, 0.0f, false, true, 55.0f, 184.0f)
                close()
                moveTo(132.0f, 219.94f)
                lineTo(132.0f, 135.68f)
                lineTo(201.0f, 184.0f)
                arcTo(91.94f, 91.94f, 0.0f, false, true, 132.0f, 219.91f)
                close()
            }
        }
        .build()
        return _peace!!
    }

private var _peace: ImageVector? = null
