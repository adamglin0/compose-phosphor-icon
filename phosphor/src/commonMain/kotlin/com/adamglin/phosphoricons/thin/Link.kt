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

public val ThinGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 88.12f)
                arcToRelative(50.44f, 50.44f, 0.0f, false, true, -14.81f, 34.31f)
                lineToRelative(-34.75f, 34.74f)
                arcTo(50.33f, 50.33f, 0.0f, false, true, 150.62f, 172.0f)
                horizontalLineToRelative(-0.05f)
                arcTo(50.63f, 50.63f, 0.0f, false, true, 100.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -3.89f)
                horizontalLineToRelative(0.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.89f, 4.11f)
                arcTo(42.64f, 42.64f, 0.0f, false, false, 150.58f, 164.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(42.32f, 42.32f, 0.0f, false, false, 30.14f, -12.49f)
                lineToRelative(34.75f, -34.74f)
                arcToRelative(42.63f, 42.63f, 0.0f, true, false, -60.29f, -60.28f)
                lineToRelative(-11.0f, 11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.65f)
                lineToRelative(11.0f, -11.0f)
                arcTo(50.64f, 50.64f, 0.0f, false, true, 236.0f, 88.12f)
                close()
                moveTo(111.78f, 188.49f)
                lineToRelative(-11.0f, 11.0f)
                arcTo(42.33f, 42.33f, 0.0f, false, true, 70.6f, 212.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(42.63f, 42.63f, 0.0f, false, true, -30.11f, -72.77f)
                lineToRelative(34.75f, -34.74f)
                arcTo(42.63f, 42.63f, 0.0f, false, true, 148.0f, 135.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.23f)
                arcTo(50.64f, 50.64f, 0.0f, false, false, 69.55f, 98.83f)
                lineTo(34.8f, 133.57f)
                arcTo(50.63f, 50.63f, 0.0f, false, false, 70.56f, 220.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(50.33f, 50.33f, 0.0f, false, false, 35.81f, -14.83f)
                lineToRelative(11.0f, -11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.65f, -5.66f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
