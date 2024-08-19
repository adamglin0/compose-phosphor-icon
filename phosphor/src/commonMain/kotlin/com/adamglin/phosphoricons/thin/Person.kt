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

public val ThinGroup.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = Builder(name = "Person", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 68.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 68.0f)
                close()
                moveTo(128.0f, 20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 20.0f)
                close()
                moveTo(215.42f, 136.78f)
                lineTo(170.17f, 85.48f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -21.0f, -9.48f)
                lineTo(106.83f, 76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -21.0f, 9.48f)
                lineToRelative(-45.25f, 51.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.56f, 22.69f)
                lineTo(89.0f, 138.7f)
                lineToRelative(-19.7f, 74.88f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 29.08f, 13.35f)
                lineTo(128.0f, 176.0f)
                lineToRelative(29.58f, 51.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 29.08f, -13.35f)
                lineTo(167.0f, 138.7f)
                lineToRelative(25.9f, 20.77f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.56f, -22.69f)
                close()
                moveTo(209.66f, 153.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f)
                arcToRelative(3.11f, 3.11f, 0.0f, false, false, -0.33f, -0.29f)
                lineToRelative(-35.51f, -28.48f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.38f, 4.13f)
                lineTo(179.0f, 215.94f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, false, 0.24f, 0.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.5f, 6.76f)
                curveToRelative(-0.05f, -0.11f, -0.11f, -0.21f, -0.17f, -0.32f)
                lineTo(131.46f, 166.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.92f, 0.0f)
                lineTo(91.42f, 223.05f)
                curveToRelative(-0.06f, 0.11f, -0.12f, 0.21f, -0.17f, 0.32f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.5f, -6.76f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, false, 0.24f, -0.67f)
                lineTo(99.87f, 129.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.38f, -4.13f)
                lineTo(58.0f, 153.36f)
                arcToRelative(3.11f, 3.11f, 0.0f, false, false, -0.33f, 0.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, -11.31f)
                lineToRelative(0.17f, -0.18f)
                lineTo(91.83f, 90.77f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 15.0f, -6.77f)
                horizontalLineToRelative(42.34f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 15.0f, 6.77f)
                lineToRelative(45.32f, 51.39f)
                lineToRelative(0.17f, 0.18f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 209.66f, 153.65f)
                close()
            }
        }
        .build()
        return _person!!
    }

private var _person: ImageVector? = null
