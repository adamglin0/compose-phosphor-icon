package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = Builder(name = "Person", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 40.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 160.0f, 40.0f)
                close()
                moveTo(128.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 56.0f)
                close()
                moveTo(218.34f, 134.05f)
                lineTo(173.17f, 82.83f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -24.0f, -10.83f)
                lineTo(106.83f, 72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -24.0f, 10.83f)
                lineTo(37.66f, 134.05f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.13f, 28.43f)
                lineToRelative(16.3f, -13.08f)
                lineTo(65.55f, 212.28f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 102.0f, 228.8f)
                lineToRelative(26.0f, -44.87f)
                lineToRelative(26.0f, 44.87f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 36.41f, -16.52f)
                lineTo(173.91f, 149.4f)
                lineToRelative(16.3f, 13.08f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.13f, -28.43f)
                close()
                moveTo(206.83f, 150.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                curveToRelative(-0.21f, -0.2f, -0.42f, -0.4f, -0.65f, -0.58f)
                lineTo(165.0f, 121.76f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.26f, 130.0f)
                lineTo(175.14f, 217.0f)
                arcToRelative(7.72f, 7.72f, 0.0f, false, false, 0.48f, 1.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.25f, 3.38f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, false, -0.33f, -0.63f)
                lineTo(134.92f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.84f, 0.0f)
                lineTo(88.0f, 221.05f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, false, -0.33f, 0.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.26f, 2.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.0f, -5.45f)
                arcToRelative(7.72f, 7.72f, 0.0f, false, false, 0.48f, -1.35f)
                lineTo(103.74f, 130.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 91.0f, 121.76f)
                lineTo(55.48f, 150.24f)
                curveToRelative(-0.23f, 0.18f, -0.44f, 0.38f, -0.65f, 0.58f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.66f, -5.65f)
                curveToRelative(0.12f, -0.12f, 0.23f, -0.24f, 0.34f, -0.37f)
                lineTo(94.83f, 93.41f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 12.0f, -5.41f)
                horizontalLineToRelative(42.34f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 12.0f, 5.41f)
                lineToRelative(45.32f, 51.39f)
                curveToRelative(0.11f, 0.13f, 0.22f, 0.25f, 0.34f, 0.37f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 206.83f, 150.82f)
                close()
            }
        }
        .build()
        return _person!!
    }

private var _person: ImageVector? = null
