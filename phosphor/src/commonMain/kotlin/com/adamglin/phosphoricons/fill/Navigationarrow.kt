package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) {
            return _navigationArrow!!
        }
        _navigationArrow = Builder(name = "NavigationArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 121.58f)
                arcToRelative(15.76f, 15.76f, 0.0f, false, true, -11.29f, 15.0f)
                lineToRelative(-0.2f, 0.06f)
                lineToRelative(-78.0f, 21.84f)
                lineToRelative(-21.84f, 78.0f)
                lineToRelative(-0.06f, 0.2f)
                arcToRelative(15.77f, 15.77f, 0.0f, false, true, -15.0f, 11.29f)
                horizontalLineToRelative(-0.3f)
                arcToRelative(15.77f, 15.77f, 0.0f, false, true, -15.07f, -10.67f)
                lineTo(41.0f, 61.41f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.05f, -0.16f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 61.25f, 40.9f)
                lineToRelative(0.16f, 0.05f)
                lineToRelative(175.92f, 65.26f)
                arcTo(15.78f, 15.78f, 0.0f, false, true, 248.0f, 121.58f)
                close()
            }
        }
        .build()
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
