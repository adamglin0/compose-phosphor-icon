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

public val ThinGroup.Navigationarrow: ImageVector
    get() {
        if (_navigationarrow != null) {
            return _navigationarrow!!
        }
        _navigationarrow = Builder(name = "Navigationarrow", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 110.0f)
                lineTo(59.93f, 44.67f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.69f, 60.0f)
                lineTo(110.0f, 235.93f)
                arcTo(11.83f, 11.83f, 0.0f, false, false, 121.28f, 244.0f)
                horizontalLineToRelative(0.22f)
                arcToRelative(11.82f, 11.82f, 0.0f, false, false, 11.26f, -8.47f)
                lineToRelative(0.0f, -0.1f)
                lineToRelative(22.45f, -80.19f)
                lineToRelative(80.19f, -22.44f)
                lineToRelative(0.1f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 236.0f, 110.0f)
                close()
                moveTo(233.21f, 125.12f)
                lineTo(150.91f, 148.12f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.78f, 2.77f)
                lineToRelative(-23.0f, 82.3f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, true, -3.74f, 2.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.88f, -2.77f)
                lineTo(52.22f, 57.32f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, 1.0f, -4.14f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 56.0f, 52.0f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, true, 1.25f, 0.21f)
                lineToRelative(176.08f, 65.32f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.09f, 7.59f)
                close()
            }
        }
        .build()
        return _navigationarrow!!
    }

private var _navigationarrow: ImageVector? = null
