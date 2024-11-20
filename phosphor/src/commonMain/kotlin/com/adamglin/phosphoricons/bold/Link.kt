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

public val BoldGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(117.18f, 188.74f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-5.12f, 5.12f)
                arcTo(58.26f, 58.26f, 0.0f, false, true, 70.6f, 228.0f)
                horizontalLineToRelative(0.0f)
                arcTo(58.62f, 58.62f, 0.0f, false, true, 29.14f, 127.92f)
                lineTo(63.89f, 93.17f)
                arcToRelative(58.64f, 58.64f, 0.0f, false, true, 98.56f, 28.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -23.37f, 5.44f)
                arcToRelative(34.65f, 34.65f, 0.0f, false, false, -58.22f, -16.58f)
                lineTo(46.11f, 144.89f)
                arcTo(34.62f, 34.62f, 0.0f, false, false, 70.57f, 204.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(34.41f, 34.41f, 0.0f, false, false, 24.49f, -10.14f)
                lineToRelative(5.11f, -5.12f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 117.18f, 188.74f)
                close()
                moveTo(226.83f, 45.17f)
                arcToRelative(58.65f, 58.65f, 0.0f, false, false, -82.93f, 0.0f)
                lineToRelative(-5.11f, 5.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(5.12f, -5.12f)
                arcToRelative(34.63f, 34.63f, 0.0f, true, true, 49.0f, 49.0f)
                lineTo(175.1f, 145.86f)
                arcTo(34.39f, 34.39f, 0.0f, false, true, 150.61f, 156.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(34.63f, 34.63f, 0.0f, false, true, -33.69f, -26.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.38f, 5.44f)
                arcTo(58.64f, 58.64f, 0.0f, false, false, 150.56f, 180.0f)
                horizontalLineToRelative(0.05f)
                arcToRelative(58.28f, 58.28f, 0.0f, false, false, 41.47f, -17.17f)
                lineToRelative(34.75f, -34.75f)
                arcToRelative(58.62f, 58.62f, 0.0f, false, false, 0.0f, -82.91f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
