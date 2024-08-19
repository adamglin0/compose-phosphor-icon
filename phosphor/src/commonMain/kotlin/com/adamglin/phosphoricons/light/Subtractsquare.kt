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

public val LightGroup.Subtractsquare: ImageVector
    get() {
        if (_subtractsquare != null) {
            return _subtractsquare!!
        }
        _subtractsquare = Builder(name = "Subtractsquare", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 90.0f)
                lineTo(166.0f, 90.0f)
                lineTo(166.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(40.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(34.0f, 160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(90.0f, 166.0f)
                verticalLineToRelative(50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(216.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(222.0f, 96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 90.0f)
                close()
                moveTo(162.48f, 210.0f)
                lineToRelative(-44.0f, -44.0f)
                horizontalLineToRelative(39.0f)
                lineToRelative(44.0f, 44.0f)
                close()
                moveTo(166.0f, 157.52f)
                verticalLineToRelative(-39.0f)
                lineToRelative(44.0f, 44.0f)
                verticalLineToRelative(39.0f)
                close()
                moveTo(210.0f, 145.52f)
                lineTo(166.48f, 102.0f)
                lineTo(210.0f, 102.0f)
                close()
                moveTo(46.0f, 46.0f)
                lineTo(154.0f, 46.0f)
                lineTo(154.0f, 154.0f)
                lineTo(46.0f, 154.0f)
                close()
                moveTo(102.0f, 166.48f)
                lineTo(145.52f, 210.0f)
                lineTo(102.0f, 210.0f)
                close()
            }
        }
        .build()
        return _subtractsquare!!
    }

private var _subtractsquare: ImageVector? = null
