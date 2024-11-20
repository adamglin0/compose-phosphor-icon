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

public val RegularGroup.PersonArmsSpread: ImageVector
    get() {
        if (_personArmsSpread != null) {
            return _personArmsSpread!!
        }
        _personArmsSpread = Builder(name = "PersonArmsSpread", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(231.5f, 87.71f)
                arcTo(19.62f, 19.62f, 0.0f, false, false, 212.0f, 72.0f)
                lineTo(44.0f, 72.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -8.38f, 38.16f)
                lineToRelative(0.13f, 0.0f)
                lineToRelative(50.75f, 22.35f)
                lineToRelative(-21.0f, 79.72f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 102.0f, 228.8f)
                lineToRelative(26.0f, -44.87f)
                lineToRelative(26.0f, 44.87f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 36.4f, -16.52f)
                lineToRelative(-21.0f, -79.72f)
                lineToRelative(50.75f, -22.35f)
                lineToRelative(0.13f, 0.0f)
                arcTo(19.64f, 19.64f, 0.0f, false, false, 231.5f, 87.71f)
                close()
                moveTo(213.7f, 95.61f)
                lineTo(156.77f, 120.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.51f, 9.36f)
                lineTo(175.13f, 217.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.49f, 1.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.0f, 5.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.25f, -2.07f)
                arcToRelative(6.31f, 6.31f, 0.0f, false, false, -0.34f, -0.63f)
                lineTo(134.92f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.84f, 0.0f)
                lineTo(88.0f, 221.05f)
                arcToRelative(6.31f, 6.31f, 0.0f, false, false, -0.34f, 0.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.25f, 2.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.0f, -5.45f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.49f, -1.35f)
                lineTo(103.74f, 130.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.51f, -9.36f)
                lineTo(42.3f, 95.61f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 44.0f, 88.0f)
                lineTo(212.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.73f, 7.61f)
                close()
            }
        }
        .build()
        return _personArmsSpread!!
    }

private var _personArmsSpread: ImageVector? = null
