package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.TriangleDashed: ImageVector
    get() {
        if (_triangleDashed != null) {
            return _triangleDashed!!
        }
        _triangleDashed = Builder(name = "TriangleDashed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(158.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(104.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 158.0f, 216.0f)
                close()
                moveTo(235.07f, 189.09f)
                lineTo(230.41f, 181.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -10.4f, 6.0f)
                lineToRelative(4.66f, 8.09f)
                arcToRelative(9.49f, 9.49f, 0.0f, false, true, 0.0f, 9.72f)
                arcToRelative(10.46f, 10.46f, 0.0f, false, true, -9.21f, 5.2f)
                lineTo(192.0f, 210.01f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(23.45f)
                arcToRelative(22.37f, 22.37f, 0.0f, false, false, 19.6f, -11.19f)
                arcTo(21.53f, 21.53f, 0.0f, false, false, 235.07f, 189.09f)
                close()
                moveTo(64.0f, 210.0f)
                lineTo(40.55f, 210.0f)
                arcToRelative(10.46f, 10.46f, 0.0f, false, true, -9.21f, -5.2f)
                arcToRelative(9.49f, 9.49f, 0.0f, false, true, 0.0f, -9.72f)
                lineTo(36.0f, 187.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.4f, -6.0f)
                lineToRelative(-4.66f, 8.08f)
                arcToRelative(21.53f, 21.53f, 0.0f, false, false, 0.0f, 21.72f)
                arcTo(22.37f, 22.37f, 0.0f, false, false, 40.55f, 222.0f)
                lineTo(64.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(202.18f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.2f, -9.0f)
                lineToRelative(-23.0f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -10.4f, 6.0f)
                lineToRelative(23.0f, 40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 202.18f, 150.0f)
                close()
                moveTo(147.61f, 37.22f)
                arcToRelative(22.75f, 22.75f, 0.0f, false, false, -39.22f, 0.0f)
                lineTo(94.69f, 61.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.4f, 6.0f)
                lineToRelative(13.7f, -23.78f)
                arcToRelative(10.75f, 10.75f, 0.0f, false, true, 18.42f, 0.0f)
                lineTo(150.91f, 67.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.4f, -6.0f)
                close()
                moveTo(79.85f, 98.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 71.66f, 101.0f)
                lineToRelative(-23.0f, 40.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 59.0f, 147.0f)
                lineToRelative(23.0f, -40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 79.85f, 98.8f)
                close()
            }
        }
        .build()
        return _triangleDashed!!
    }

private var _triangleDashed: ImageVector? = null
