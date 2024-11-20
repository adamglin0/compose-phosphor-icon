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

public val BoldGroup.UniteSquare: ImageVector
    get() {
        if (_uniteSquare != null) {
            return _uniteSquare!!
        }
        _uniteSquare = Builder(name = "UniteSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 160.0f)
                lineTo(228.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(172.0f, 84.0f)
                lineTo(172.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(40.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 40.0f)
                lineTo(28.0f, 96.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(84.0f, 172.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 160.0f)
                close()
                moveTo(165.0f, 204.0f)
                lineTo(52.0f, 91.0f)
                lineTo(52.0f, 69.0f)
                lineTo(187.0f, 204.0f)
                close()
                moveTo(69.0f, 52.0f)
                lineTo(91.0f, 52.0f)
                lineTo(204.0f, 165.0f)
                lineTo(204.0f, 187.0f)
                close()
                moveTo(204.0f, 131.0f)
                lineTo(181.0f, 108.0f)
                horizontalLineToRelative(23.0f)
                close()
                moveTo(148.0f, 75.0f)
                lineTo(125.0f, 52.0f)
                horizontalLineToRelative(23.0f)
                close()
                moveTo(52.0f, 125.0f)
                lineToRelative(23.0f, 23.0f)
                lineTo(52.0f, 148.0f)
                close()
                moveTo(108.0f, 181.0f)
                lineTo(131.0f, 204.0f)
                lineTo(108.0f, 204.0f)
                close()
            }
        }
        .build()
        return _uniteSquare!!
    }

private var _uniteSquare: ImageVector? = null
