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

public val ThinGroup.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) {
            return _gitMerge!!
        }
        _gitMerge = Builder(name = "GitMerge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 116.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -27.62f, 23.44f)
                lineToRelative(-45.85f, -6.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.41f, -4.07f)
                lineTo(87.75f, 82.9f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 76.0f, 83.71f)
                verticalLineToRelative(88.58f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 8.0f, 0.0f)
                lineTo(84.0f, 90.81f)
                lineTo(121.0f, 134.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 12.36f, 6.78f)
                lineToRelative(46.83f, 6.69f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 208.0f, 116.0f)
                close()
                moveTo(60.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 80.0f, 76.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 60.0f, 56.0f)
                close()
                moveTo(100.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 100.0f, 200.0f)
                close()
                moveTo(208.0f, 164.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 208.0f, 164.0f)
                close()
            }
        }
        .build()
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
