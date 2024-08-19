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

public val RegularGroup.Treepalm: ImageVector
    get() {
        if (_treepalm != null) {
            return _treepalm!!
        }
        _treepalm = Builder(name = "Treepalm", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.79f, 53.23f)
                arcToRelative(66.86f, 66.86f, 0.0f, false, false, -97.74f, 0.0f)
                arcToRelative(72.21f, 72.21f, 0.0f, false, false, -12.05f, 17.0f)
                arcToRelative(72.21f, 72.21f, 0.0f, false, false, -12.0f, -17.0f)
                arcToRelative(66.86f, 66.86f, 0.0f, false, false, -97.74f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.6f, 12.85f)
                lineTo(77.0f, 90.55f)
                arcToRelative(71.42f, 71.42f, 0.0f, false, false, -43.36f, 33.21f)
                arcToRelative(70.64f, 70.64f, 0.0f, false, false, -7.2f, 54.32f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 39.0f, 182.36f)
                lineToRelative(81.0f, -61.68f)
                verticalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(120.68f)
                lineToRelative(81.0f, 61.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.57f, -4.28f)
                arcToRelative(70.64f, 70.64f, 0.0f, false, false, -7.2f, -54.32f)
                arcTo(71.42f, 71.42f, 0.0f, false, false, 179.0f, 90.55f)
                lineToRelative(56.22f, -24.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.6f, -12.85f)
                close()
                moveTo(67.08f, 48.0f)
                arcToRelative(51.13f, 51.13f, 0.0f, false, true, 37.28f, 16.26f)
                arcToRelative(56.53f, 56.53f, 0.0f, false, true, 14.26f, 26.93f)
                lineTo(39.0f, 56.53f)
                arcTo(50.5f, 50.5f, 0.0f, false, true, 67.08f, 48.0f)
                close()
                moveTo(40.0f, 161.5f)
                arcToRelative(54.82f, 54.82f, 0.0f, false, true, 7.47f, -29.7f)
                arcToRelative(55.55f, 55.55f, 0.0f, false, true, 34.0f, -25.89f)
                arcTo(56.52f, 56.52f, 0.0f, false, true, 96.1f, 104.0f)
                arcToRelative(55.82f, 55.82f, 0.0f, false, true, 16.23f, 2.41f)
                close()
                moveTo(208.5f, 131.8f)
                arcTo(54.82f, 54.82f, 0.0f, false, true, 216.0f, 161.5f)
                lineToRelative(-72.3f, -55.1f)
                arcToRelative(56.3f, 56.3f, 0.0f, false, true, 64.83f, 25.4f)
                close()
                moveTo(137.38f, 91.19f)
                arcToRelative(56.53f, 56.53f, 0.0f, false, true, 14.26f, -26.93f)
                arcTo(51.13f, 51.13f, 0.0f, false, true, 188.92f, 48.0f)
                arcTo(50.5f, 50.5f, 0.0f, false, true, 217.0f, 56.53f)
                close()
            }
        }
        .build()
        return _treepalm!!
    }

private var _treepalm: ImageVector? = null
