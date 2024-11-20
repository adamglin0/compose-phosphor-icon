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

public val ThinGroup.Ranking: ImageVector
    get() {
        if (_ranking != null) {
            return _ranking!!
        }
        _ranking = Builder(name = "Ranking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.21f, 101.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.53f, -5.05f)
                lineToRelative(12.0f, -4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 136.0f, 96.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(128.0f, 101.55f)
                lineToRelative(-6.74f, 2.24f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 116.21f, 101.26f)
                close()
                moveTo(244.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(16.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(28.0f, 204.0f)
                lineTo(28.0f, 104.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 92.0f)
                lineTo(84.0f, 92.0f)
                lineTo(84.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 44.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(76.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(60.0f)
                horizontalLineToRelative(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 208.0f)
                close()
                moveTo(172.0f, 140.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(48.0f)
                lineTo(220.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                close()
                moveTo(92.0f, 204.0f)
                horizontalLineToRelative(72.0f)
                lineTo(164.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(96.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                close()
                moveTo(36.0f, 204.0f)
                lineTo(84.0f, 204.0f)
                lineTo(84.0f, 100.0f)
                lineTo(40.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _ranking!!
    }

private var _ranking: ImageVector? = null
